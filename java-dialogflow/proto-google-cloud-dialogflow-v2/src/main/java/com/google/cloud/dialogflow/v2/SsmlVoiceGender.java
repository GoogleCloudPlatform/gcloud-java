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
// source: google/cloud/dialogflow/v2/audio_config.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * Gender of the voice as described in
 * [SSML voice element](https://www.w3.org/TR/speech-synthesis11/#edef_voice).
 * </pre>
 *
 * Protobuf enum {@code google.cloud.dialogflow.v2.SsmlVoiceGender}
 */
public enum SsmlVoiceGender implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * An unspecified gender, which means that the client doesn't care which
   * gender the selected voice will have.
   * </pre>
   *
   * <code>SSML_VOICE_GENDER_UNSPECIFIED = 0;</code>
   */
  SSML_VOICE_GENDER_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * A male voice.
   * </pre>
   *
   * <code>SSML_VOICE_GENDER_MALE = 1;</code>
   */
  SSML_VOICE_GENDER_MALE(1),
  /**
   *
   *
   * <pre>
   * A female voice.
   * </pre>
   *
   * <code>SSML_VOICE_GENDER_FEMALE = 2;</code>
   */
  SSML_VOICE_GENDER_FEMALE(2),
  /**
   *
   *
   * <pre>
   * A gender-neutral voice.
   * </pre>
   *
   * <code>SSML_VOICE_GENDER_NEUTRAL = 3;</code>
   */
  SSML_VOICE_GENDER_NEUTRAL(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * An unspecified gender, which means that the client doesn't care which
   * gender the selected voice will have.
   * </pre>
   *
   * <code>SSML_VOICE_GENDER_UNSPECIFIED = 0;</code>
   */
  public static final int SSML_VOICE_GENDER_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * A male voice.
   * </pre>
   *
   * <code>SSML_VOICE_GENDER_MALE = 1;</code>
   */
  public static final int SSML_VOICE_GENDER_MALE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * A female voice.
   * </pre>
   *
   * <code>SSML_VOICE_GENDER_FEMALE = 2;</code>
   */
  public static final int SSML_VOICE_GENDER_FEMALE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * A gender-neutral voice.
   * </pre>
   *
   * <code>SSML_VOICE_GENDER_NEUTRAL = 3;</code>
   */
  public static final int SSML_VOICE_GENDER_NEUTRAL_VALUE = 3;

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
  public static SsmlVoiceGender valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SsmlVoiceGender forNumber(int value) {
    switch (value) {
      case 0:
        return SSML_VOICE_GENDER_UNSPECIFIED;
      case 1:
        return SSML_VOICE_GENDER_MALE;
      case 2:
        return SSML_VOICE_GENDER_FEMALE;
      case 3:
        return SSML_VOICE_GENDER_NEUTRAL;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SsmlVoiceGender> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<SsmlVoiceGender> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<SsmlVoiceGender>() {
        public SsmlVoiceGender findValueByNumber(int number) {
          return SsmlVoiceGender.forNumber(number);
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
    return com.google.cloud.dialogflow.v2.AudioConfigProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final SsmlVoiceGender[] VALUES = values();

  public static SsmlVoiceGender valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SsmlVoiceGender(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.v2.SsmlVoiceGender)
}
