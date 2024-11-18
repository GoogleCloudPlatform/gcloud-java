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
// source: google/maps/fleetengine/v1/trips.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.fleetengine.v1;

/**
 *
 *
 * <pre>
 * A set of values that indicate upon which platform the request was issued.
 * </pre>
 *
 * Protobuf enum {@code maps.fleetengine.v1.BillingPlatformIdentifier}
 */
public enum BillingPlatformIdentifier implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Default. Used for unspecified platforms.
   * </pre>
   *
   * <code>BILLING_PLATFORM_IDENTIFIER_UNSPECIFIED = 0;</code>
   */
  BILLING_PLATFORM_IDENTIFIER_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The platform is a client server.
   * </pre>
   *
   * <code>SERVER = 1;</code>
   */
  SERVER(1),
  /**
   *
   *
   * <pre>
   * The platform is a web browser.
   * </pre>
   *
   * <code>WEB = 2;</code>
   */
  WEB(2),
  /**
   *
   *
   * <pre>
   * The platform is an Android mobile device.
   * </pre>
   *
   * <code>ANDROID = 3;</code>
   */
  ANDROID(3),
  /**
   *
   *
   * <pre>
   * The platform is an IOS mobile device.
   * </pre>
   *
   * <code>IOS = 4;</code>
   */
  IOS(4),
  /**
   *
   *
   * <pre>
   * Other platforms that are not listed in this enumeration.
   * </pre>
   *
   * <code>OTHERS = 5;</code>
   */
  OTHERS(5),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Default. Used for unspecified platforms.
   * </pre>
   *
   * <code>BILLING_PLATFORM_IDENTIFIER_UNSPECIFIED = 0;</code>
   */
  public static final int BILLING_PLATFORM_IDENTIFIER_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The platform is a client server.
   * </pre>
   *
   * <code>SERVER = 1;</code>
   */
  public static final int SERVER_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The platform is a web browser.
   * </pre>
   *
   * <code>WEB = 2;</code>
   */
  public static final int WEB_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The platform is an Android mobile device.
   * </pre>
   *
   * <code>ANDROID = 3;</code>
   */
  public static final int ANDROID_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The platform is an IOS mobile device.
   * </pre>
   *
   * <code>IOS = 4;</code>
   */
  public static final int IOS_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Other platforms that are not listed in this enumeration.
   * </pre>
   *
   * <code>OTHERS = 5;</code>
   */
  public static final int OTHERS_VALUE = 5;

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
  public static BillingPlatformIdentifier valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BillingPlatformIdentifier forNumber(int value) {
    switch (value) {
      case 0:
        return BILLING_PLATFORM_IDENTIFIER_UNSPECIFIED;
      case 1:
        return SERVER;
      case 2:
        return WEB;
      case 3:
        return ANDROID;
      case 4:
        return IOS;
      case 5:
        return OTHERS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BillingPlatformIdentifier>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<BillingPlatformIdentifier>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BillingPlatformIdentifier>() {
            public BillingPlatformIdentifier findValueByNumber(int number) {
              return BillingPlatformIdentifier.forNumber(number);
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
    return com.google.maps.fleetengine.v1.Trips.getDescriptor().getEnumTypes().get(1);
  }

  private static final BillingPlatformIdentifier[] VALUES = values();

  public static BillingPlatformIdentifier valueOf(
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

  private BillingPlatformIdentifier(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:maps.fleetengine.v1.BillingPlatformIdentifier)
}
