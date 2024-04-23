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
// source: google/cloud/beyondcorp/appconnectors/v1/resource_info.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.beyondcorp.appconnectors.v1;

/**
 *
 *
 * <pre>
 * HealthStatus represents the health status.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.beyondcorp.appconnectors.v1.HealthStatus}
 */
public enum HealthStatus implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Health status is unknown: not initialized or failed to retrieve.
   * </pre>
   *
   * <code>HEALTH_STATUS_UNSPECIFIED = 0;</code>
   */
  HEALTH_STATUS_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The resource is healthy.
   * </pre>
   *
   * <code>HEALTHY = 1;</code>
   */
  HEALTHY(1),
  /**
   *
   *
   * <pre>
   * The resource is unhealthy.
   * </pre>
   *
   * <code>UNHEALTHY = 2;</code>
   */
  UNHEALTHY(2),
  /**
   *
   *
   * <pre>
   * The resource is unresponsive.
   * </pre>
   *
   * <code>UNRESPONSIVE = 3;</code>
   */
  UNRESPONSIVE(3),
  /**
   *
   *
   * <pre>
   * Some sub-resources are UNHEALTHY.
   * </pre>
   *
   * <code>DEGRADED = 4;</code>
   */
  DEGRADED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Health status is unknown: not initialized or failed to retrieve.
   * </pre>
   *
   * <code>HEALTH_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int HEALTH_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The resource is healthy.
   * </pre>
   *
   * <code>HEALTHY = 1;</code>
   */
  public static final int HEALTHY_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The resource is unhealthy.
   * </pre>
   *
   * <code>UNHEALTHY = 2;</code>
   */
  public static final int UNHEALTHY_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The resource is unresponsive.
   * </pre>
   *
   * <code>UNRESPONSIVE = 3;</code>
   */
  public static final int UNRESPONSIVE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Some sub-resources are UNHEALTHY.
   * </pre>
   *
   * <code>DEGRADED = 4;</code>
   */
  public static final int DEGRADED_VALUE = 4;

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
  public static HealthStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HealthStatus forNumber(int value) {
    switch (value) {
      case 0:
        return HEALTH_STATUS_UNSPECIFIED;
      case 1:
        return HEALTHY;
      case 2:
        return UNHEALTHY;
      case 3:
        return UNRESPONSIVE;
      case 4:
        return DEGRADED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HealthStatus> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<HealthStatus> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<HealthStatus>() {
        public HealthStatus findValueByNumber(int number) {
          return HealthStatus.forNumber(number);
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
    return com.google.cloud.beyondcorp.appconnectors.v1.ResourceInfoProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final HealthStatus[] VALUES = values();

  public static HealthStatus valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private HealthStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.beyondcorp.appconnectors.v1.HealthStatus)
}
