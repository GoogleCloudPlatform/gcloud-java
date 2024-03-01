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
// source: google/cloud/discoveryengine/v1/common.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.discoveryengine.v1;

/**
 *
 *
 * <pre>
 * The industry vertical associated with the
 * [DataStore][google.cloud.discoveryengine.v1.DataStore].
 * </pre>
 *
 * Protobuf enum {@code google.cloud.discoveryengine.v1.IndustryVertical}
 */
public enum IndustryVertical implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Value used when unset.
   * </pre>
   *
   * <code>INDUSTRY_VERTICAL_UNSPECIFIED = 0;</code>
   */
  INDUSTRY_VERTICAL_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The generic vertical for documents that are not specific to any industry
   * vertical.
   * </pre>
   *
   * <code>GENERIC = 1;</code>
   */
  GENERIC(1),
  /**
   *
   *
   * <pre>
   * The media industry vertical.
   * </pre>
   *
   * <code>MEDIA = 2;</code>
   */
  MEDIA(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Value used when unset.
   * </pre>
   *
   * <code>INDUSTRY_VERTICAL_UNSPECIFIED = 0;</code>
   */
  public static final int INDUSTRY_VERTICAL_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The generic vertical for documents that are not specific to any industry
   * vertical.
   * </pre>
   *
   * <code>GENERIC = 1;</code>
   */
  public static final int GENERIC_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The media industry vertical.
   * </pre>
   *
   * <code>MEDIA = 2;</code>
   */
  public static final int MEDIA_VALUE = 2;

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
  public static IndustryVertical valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IndustryVertical forNumber(int value) {
    switch (value) {
      case 0:
        return INDUSTRY_VERTICAL_UNSPECIFIED;
      case 1:
        return GENERIC;
      case 2:
        return MEDIA;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IndustryVertical> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<IndustryVertical> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<IndustryVertical>() {
        public IndustryVertical findValueByNumber(int number) {
          return IndustryVertical.forNumber(number);
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
    return com.google.cloud.discoveryengine.v1.CommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final IndustryVertical[] VALUES = values();

  public static IndustryVertical valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private IndustryVertical(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.discoveryengine.v1.IndustryVertical)
}
