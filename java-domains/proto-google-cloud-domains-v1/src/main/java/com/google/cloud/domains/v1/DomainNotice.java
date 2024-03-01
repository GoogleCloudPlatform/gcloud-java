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
// source: google/cloud/domains/v1/domains.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.domains.v1;

/**
 *
 *
 * <pre>
 * Notices about special properties of certain domains.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.domains.v1.DomainNotice}
 */
public enum DomainNotice implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The notice is undefined.
   * </pre>
   *
   * <code>DOMAIN_NOTICE_UNSPECIFIED = 0;</code>
   */
  DOMAIN_NOTICE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Indicates that the domain is preloaded on the HTTP Strict Transport
   * Security list in browsers. Serving a website on such domain requires
   * an SSL certificate. For details, see
   * [how to get an SSL
   * certificate](https://support.google.com/domains/answer/7638036).
   * </pre>
   *
   * <code>HSTS_PRELOADED = 1;</code>
   */
  HSTS_PRELOADED(1),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The notice is undefined.
   * </pre>
   *
   * <code>DOMAIN_NOTICE_UNSPECIFIED = 0;</code>
   */
  public static final int DOMAIN_NOTICE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Indicates that the domain is preloaded on the HTTP Strict Transport
   * Security list in browsers. Serving a website on such domain requires
   * an SSL certificate. For details, see
   * [how to get an SSL
   * certificate](https://support.google.com/domains/answer/7638036).
   * </pre>
   *
   * <code>HSTS_PRELOADED = 1;</code>
   */
  public static final int HSTS_PRELOADED_VALUE = 1;

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
  public static DomainNotice valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DomainNotice forNumber(int value) {
    switch (value) {
      case 0:
        return DOMAIN_NOTICE_UNSPECIFIED;
      case 1:
        return HSTS_PRELOADED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DomainNotice> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DomainNotice> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<DomainNotice>() {
        public DomainNotice findValueByNumber(int number) {
          return DomainNotice.forNumber(number);
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
    return com.google.cloud.domains.v1.DomainsProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final DomainNotice[] VALUES = values();

  public static DomainNotice valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DomainNotice(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.domains.v1.DomainNotice)
}
