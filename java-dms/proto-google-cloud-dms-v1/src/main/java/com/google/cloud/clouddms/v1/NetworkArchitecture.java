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
// source: google/cloud/clouddms/v1/clouddms_resources.proto

package com.google.cloud.clouddms.v1;

/** Protobuf enum {@code google.cloud.clouddms.v1.NetworkArchitecture} */
public enum NetworkArchitecture implements com.google.protobuf.ProtocolMessageEnum {
  /** <code>NETWORK_ARCHITECTURE_UNSPECIFIED = 0;</code> */
  NETWORK_ARCHITECTURE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Instance is in Cloud SQL's old producer network architecture.
   * </pre>
   *
   * <code>NETWORK_ARCHITECTURE_OLD_CSQL_PRODUCER = 1;</code>
   */
  NETWORK_ARCHITECTURE_OLD_CSQL_PRODUCER(1),
  /**
   *
   *
   * <pre>
   * Instance is in Cloud SQL's new producer network architecture.
   * </pre>
   *
   * <code>NETWORK_ARCHITECTURE_NEW_CSQL_PRODUCER = 2;</code>
   */
  NETWORK_ARCHITECTURE_NEW_CSQL_PRODUCER(2),
  UNRECOGNIZED(-1),
  ;

  /** <code>NETWORK_ARCHITECTURE_UNSPECIFIED = 0;</code> */
  public static final int NETWORK_ARCHITECTURE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Instance is in Cloud SQL's old producer network architecture.
   * </pre>
   *
   * <code>NETWORK_ARCHITECTURE_OLD_CSQL_PRODUCER = 1;</code>
   */
  public static final int NETWORK_ARCHITECTURE_OLD_CSQL_PRODUCER_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Instance is in Cloud SQL's new producer network architecture.
   * </pre>
   *
   * <code>NETWORK_ARCHITECTURE_NEW_CSQL_PRODUCER = 2;</code>
   */
  public static final int NETWORK_ARCHITECTURE_NEW_CSQL_PRODUCER_VALUE = 2;

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
  public static NetworkArchitecture valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NetworkArchitecture forNumber(int value) {
    switch (value) {
      case 0:
        return NETWORK_ARCHITECTURE_UNSPECIFIED;
      case 1:
        return NETWORK_ARCHITECTURE_OLD_CSQL_PRODUCER;
      case 2:
        return NETWORK_ARCHITECTURE_NEW_CSQL_PRODUCER;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NetworkArchitecture>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<NetworkArchitecture>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NetworkArchitecture>() {
            public NetworkArchitecture findValueByNumber(int number) {
              return NetworkArchitecture.forNumber(number);
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
    return com.google.cloud.clouddms.v1.ClouddmsResourcesProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final NetworkArchitecture[] VALUES = values();

  public static NetworkArchitecture valueOf(
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

  private NetworkArchitecture(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.clouddms.v1.NetworkArchitecture)
}
