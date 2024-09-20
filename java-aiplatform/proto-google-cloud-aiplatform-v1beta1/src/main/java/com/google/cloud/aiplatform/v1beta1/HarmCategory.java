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
// source: google/cloud/aiplatform/v1beta1/content.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Harm categories that will block the content.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.aiplatform.v1beta1.HarmCategory}
 */
public enum HarmCategory implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The harm category is unspecified.
   * </pre>
   *
   * <code>HARM_CATEGORY_UNSPECIFIED = 0;</code>
   */
  HARM_CATEGORY_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The harm category is hate speech.
   * </pre>
   *
   * <code>HARM_CATEGORY_HATE_SPEECH = 1;</code>
   */
  HARM_CATEGORY_HATE_SPEECH(1),
  /**
   *
   *
   * <pre>
   * The harm category is dangerous content.
   * </pre>
   *
   * <code>HARM_CATEGORY_DANGEROUS_CONTENT = 2;</code>
   */
  HARM_CATEGORY_DANGEROUS_CONTENT(2),
  /**
   *
   *
   * <pre>
   * The harm category is harassment.
   * </pre>
   *
   * <code>HARM_CATEGORY_HARASSMENT = 3;</code>
   */
  HARM_CATEGORY_HARASSMENT(3),
  /**
   *
   *
   * <pre>
   * The harm category is sexually explicit content.
   * </pre>
   *
   * <code>HARM_CATEGORY_SEXUALLY_EXPLICIT = 4;</code>
   */
  HARM_CATEGORY_SEXUALLY_EXPLICIT(4),
  /**
   *
   *
   * <pre>
   * The harm category is civic integrity.
   * </pre>
   *
   * <code>HARM_CATEGORY_CIVIC_INTEGRITY = 5;</code>
   */
  HARM_CATEGORY_CIVIC_INTEGRITY(5),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The harm category is unspecified.
   * </pre>
   *
   * <code>HARM_CATEGORY_UNSPECIFIED = 0;</code>
   */
  public static final int HARM_CATEGORY_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The harm category is hate speech.
   * </pre>
   *
   * <code>HARM_CATEGORY_HATE_SPEECH = 1;</code>
   */
  public static final int HARM_CATEGORY_HATE_SPEECH_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The harm category is dangerous content.
   * </pre>
   *
   * <code>HARM_CATEGORY_DANGEROUS_CONTENT = 2;</code>
   */
  public static final int HARM_CATEGORY_DANGEROUS_CONTENT_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The harm category is harassment.
   * </pre>
   *
   * <code>HARM_CATEGORY_HARASSMENT = 3;</code>
   */
  public static final int HARM_CATEGORY_HARASSMENT_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The harm category is sexually explicit content.
   * </pre>
   *
   * <code>HARM_CATEGORY_SEXUALLY_EXPLICIT = 4;</code>
   */
  public static final int HARM_CATEGORY_SEXUALLY_EXPLICIT_VALUE = 4;
  /**
   *
   *
   * <pre>
   * The harm category is civic integrity.
   * </pre>
   *
   * <code>HARM_CATEGORY_CIVIC_INTEGRITY = 5;</code>
   */
  public static final int HARM_CATEGORY_CIVIC_INTEGRITY_VALUE = 5;

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
  public static HarmCategory valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HarmCategory forNumber(int value) {
    switch (value) {
      case 0:
        return HARM_CATEGORY_UNSPECIFIED;
      case 1:
        return HARM_CATEGORY_HATE_SPEECH;
      case 2:
        return HARM_CATEGORY_DANGEROUS_CONTENT;
      case 3:
        return HARM_CATEGORY_HARASSMENT;
      case 4:
        return HARM_CATEGORY_SEXUALLY_EXPLICIT;
      case 5:
        return HARM_CATEGORY_CIVIC_INTEGRITY;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HarmCategory> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<HarmCategory> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<HarmCategory>() {
        public HarmCategory findValueByNumber(int number) {
          return HarmCategory.forNumber(number);
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
    return com.google.cloud.aiplatform.v1beta1.ContentProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final HarmCategory[] VALUES = values();

  public static HarmCategory valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private HarmCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.HarmCategory)
}
