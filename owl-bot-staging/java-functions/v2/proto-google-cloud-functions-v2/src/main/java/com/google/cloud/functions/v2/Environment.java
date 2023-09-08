// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/functions/v2/functions.proto

package com.google.cloud.functions.v2;

/**
 * <pre>
 * The environment the function is hosted on.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.functions.v2.Environment}
 */
public enum Environment
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>ENVIRONMENT_UNSPECIFIED = 0;</code>
   */
  ENVIRONMENT_UNSPECIFIED(0),
  /**
   * <pre>
   * Gen 1
   * </pre>
   *
   * <code>GEN_1 = 1;</code>
   */
  GEN_1(1),
  /**
   * <pre>
   * Gen 2
   * </pre>
   *
   * <code>GEN_2 = 2;</code>
   */
  GEN_2(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified
   * </pre>
   *
   * <code>ENVIRONMENT_UNSPECIFIED = 0;</code>
   */
  public static final int ENVIRONMENT_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Gen 1
   * </pre>
   *
   * <code>GEN_1 = 1;</code>
   */
  public static final int GEN_1_VALUE = 1;
  /**
   * <pre>
   * Gen 2
   * </pre>
   *
   * <code>GEN_2 = 2;</code>
   */
  public static final int GEN_2_VALUE = 2;


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
  public static Environment valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Environment forNumber(int value) {
    switch (value) {
      case 0: return ENVIRONMENT_UNSPECIFIED;
      case 1: return GEN_1;
      case 2: return GEN_2;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Environment>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Environment> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Environment>() {
          public Environment findValueByNumber(int number) {
            return Environment.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.functions.v2.FunctionsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Environment[] VALUES = values();

  public static Environment valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Environment(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.functions.v2.Environment)
}

