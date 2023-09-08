// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/cvss.proto

package io.grafeas.v1;

/**
 * <pre>
 * CVSS Version.
 * </pre>
 *
 * Protobuf enum {@code grafeas.v1.CVSSVersion}
 */
public enum CVSSVersion
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CVSS_VERSION_UNSPECIFIED = 0;</code>
   */
  CVSS_VERSION_UNSPECIFIED(0),
  /**
   * <code>CVSS_VERSION_2 = 1;</code>
   */
  CVSS_VERSION_2(1),
  /**
   * <code>CVSS_VERSION_3 = 2;</code>
   */
  CVSS_VERSION_3(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CVSS_VERSION_UNSPECIFIED = 0;</code>
   */
  public static final int CVSS_VERSION_UNSPECIFIED_VALUE = 0;
  /**
   * <code>CVSS_VERSION_2 = 1;</code>
   */
  public static final int CVSS_VERSION_2_VALUE = 1;
  /**
   * <code>CVSS_VERSION_3 = 2;</code>
   */
  public static final int CVSS_VERSION_3_VALUE = 2;


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
  public static CVSSVersion valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CVSSVersion forNumber(int value) {
    switch (value) {
      case 0: return CVSS_VERSION_UNSPECIFIED;
      case 1: return CVSS_VERSION_2;
      case 2: return CVSS_VERSION_3;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CVSSVersion>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CVSSVersion> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CVSSVersion>() {
          public CVSSVersion findValueByNumber(int number) {
            return CVSSVersion.forNumber(number);
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
    return io.grafeas.v1.CVSSProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final CVSSVersion[] VALUES = values();

  public static CVSSVersion valueOf(
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

  private CVSSVersion(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:grafeas.v1.CVSSVersion)
}

