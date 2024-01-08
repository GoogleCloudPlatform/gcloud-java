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
// source: google/cloud/domains/v1/domains.proto

package com.google.cloud.domains.v1;

/**
 *
 *
 * <pre>
 * Notices related to contact information.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.domains.v1.ContactNotice}
 */
public enum ContactNotice implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The notice is undefined.
   * </pre>
   *
   * <code>CONTACT_NOTICE_UNSPECIFIED = 0;</code>
   */
  CONTACT_NOTICE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Required when setting the `privacy` field of `ContactSettings` to
   * `PUBLIC_CONTACT_DATA`, which exposes contact data publicly.
   * </pre>
   *
   * <code>PUBLIC_CONTACT_DATA_ACKNOWLEDGEMENT = 1;</code>
   */
  PUBLIC_CONTACT_DATA_ACKNOWLEDGEMENT(1),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The notice is undefined.
   * </pre>
   *
   * <code>CONTACT_NOTICE_UNSPECIFIED = 0;</code>
   */
  public static final int CONTACT_NOTICE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Required when setting the `privacy` field of `ContactSettings` to
   * `PUBLIC_CONTACT_DATA`, which exposes contact data publicly.
   * </pre>
   *
   * <code>PUBLIC_CONTACT_DATA_ACKNOWLEDGEMENT = 1;</code>
   */
  public static final int PUBLIC_CONTACT_DATA_ACKNOWLEDGEMENT_VALUE = 1;

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
  public static ContactNotice valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ContactNotice forNumber(int value) {
    switch (value) {
      case 0:
        return CONTACT_NOTICE_UNSPECIFIED;
      case 1:
        return PUBLIC_CONTACT_DATA_ACKNOWLEDGEMENT;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ContactNotice> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ContactNotice> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ContactNotice>() {
        public ContactNotice findValueByNumber(int number) {
          return ContactNotice.forNumber(number);
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
    return com.google.cloud.domains.v1.DomainsProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final ContactNotice[] VALUES = values();

  public static ContactNotice valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ContactNotice(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.domains.v1.ContactNotice)
}
