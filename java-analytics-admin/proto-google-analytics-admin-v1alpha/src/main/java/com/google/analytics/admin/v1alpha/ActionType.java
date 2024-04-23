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
// source: google/analytics/admin/v1alpha/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Types of actions that may change a resource.
 * </pre>
 *
 * Protobuf enum {@code google.analytics.admin.v1alpha.ActionType}
 */
public enum ActionType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Action type unknown or not specified.
   * </pre>
   *
   * <code>ACTION_TYPE_UNSPECIFIED = 0;</code>
   */
  ACTION_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Resource was created in this change.
   * </pre>
   *
   * <code>CREATED = 1;</code>
   */
  CREATED(1),
  /**
   *
   *
   * <pre>
   * Resource was updated in this change.
   * </pre>
   *
   * <code>UPDATED = 2;</code>
   */
  UPDATED(2),
  /**
   *
   *
   * <pre>
   * Resource was deleted in this change.
   * </pre>
   *
   * <code>DELETED = 3;</code>
   */
  DELETED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Action type unknown or not specified.
   * </pre>
   *
   * <code>ACTION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ACTION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Resource was created in this change.
   * </pre>
   *
   * <code>CREATED = 1;</code>
   */
  public static final int CREATED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Resource was updated in this change.
   * </pre>
   *
   * <code>UPDATED = 2;</code>
   */
  public static final int UPDATED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Resource was deleted in this change.
   * </pre>
   *
   * <code>DELETED = 3;</code>
   */
  public static final int DELETED_VALUE = 3;

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
  public static ActionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ActionType forNumber(int value) {
    switch (value) {
      case 0:
        return ACTION_TYPE_UNSPECIFIED;
      case 1:
        return CREATED;
      case 2:
        return UPDATED;
      case 3:
        return DELETED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ActionType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ActionType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ActionType>() {
        public ActionType findValueByNumber(int number) {
          return ActionType.forNumber(number);
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
    return com.google.analytics.admin.v1alpha.ResourcesProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final ActionType[] VALUES = values();

  public static ActionType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ActionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.analytics.admin.v1alpha.ActionType)
}
