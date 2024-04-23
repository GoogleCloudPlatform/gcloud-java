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
 * Consent field of the Google Signals settings.
 * </pre>
 *
 * Protobuf enum {@code google.analytics.admin.v1alpha.GoogleSignalsConsent}
 */
public enum GoogleSignalsConsent implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Google Signals consent value defaults to
   * GOOGLE_SIGNALS_CONSENT_UNSPECIFIED.  This will be treated as
   * GOOGLE_SIGNALS_CONSENT_NOT_CONSENTED.
   * </pre>
   *
   * <code>GOOGLE_SIGNALS_CONSENT_UNSPECIFIED = 0;</code>
   */
  GOOGLE_SIGNALS_CONSENT_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Terms of service have been accepted
   * </pre>
   *
   * <code>GOOGLE_SIGNALS_CONSENT_CONSENTED = 2;</code>
   */
  GOOGLE_SIGNALS_CONSENT_CONSENTED(2),
  /**
   *
   *
   * <pre>
   * Terms of service have not been accepted
   * </pre>
   *
   * <code>GOOGLE_SIGNALS_CONSENT_NOT_CONSENTED = 1;</code>
   */
  GOOGLE_SIGNALS_CONSENT_NOT_CONSENTED(1),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Google Signals consent value defaults to
   * GOOGLE_SIGNALS_CONSENT_UNSPECIFIED.  This will be treated as
   * GOOGLE_SIGNALS_CONSENT_NOT_CONSENTED.
   * </pre>
   *
   * <code>GOOGLE_SIGNALS_CONSENT_UNSPECIFIED = 0;</code>
   */
  public static final int GOOGLE_SIGNALS_CONSENT_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Terms of service have been accepted
   * </pre>
   *
   * <code>GOOGLE_SIGNALS_CONSENT_CONSENTED = 2;</code>
   */
  public static final int GOOGLE_SIGNALS_CONSENT_CONSENTED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Terms of service have not been accepted
   * </pre>
   *
   * <code>GOOGLE_SIGNALS_CONSENT_NOT_CONSENTED = 1;</code>
   */
  public static final int GOOGLE_SIGNALS_CONSENT_NOT_CONSENTED_VALUE = 1;

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
  public static GoogleSignalsConsent valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GoogleSignalsConsent forNumber(int value) {
    switch (value) {
      case 0:
        return GOOGLE_SIGNALS_CONSENT_UNSPECIFIED;
      case 2:
        return GOOGLE_SIGNALS_CONSENT_CONSENTED;
      case 1:
        return GOOGLE_SIGNALS_CONSENT_NOT_CONSENTED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GoogleSignalsConsent>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<GoogleSignalsConsent>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GoogleSignalsConsent>() {
            public GoogleSignalsConsent findValueByNumber(int number) {
              return GoogleSignalsConsent.forNumber(number);
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
    return com.google.analytics.admin.v1alpha.ResourcesProto.getDescriptor().getEnumTypes().get(6);
  }

  private static final GoogleSignalsConsent[] VALUES = values();

  public static GoogleSignalsConsent valueOf(
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

  private GoogleSignalsConsent(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.analytics.admin.v1alpha.GoogleSignalsConsent)
}
