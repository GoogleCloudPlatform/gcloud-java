// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/netapp/v1/common.proto

package com.google.cloud.netapp.v1;

/**
 * <pre>
 * Defined the current volume encryption key source.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.netapp.v1.EncryptionType}
 */
public enum EncryptionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The source of encryption key is not specified.
   * </pre>
   *
   * <code>ENCRYPTION_TYPE_UNSPECIFIED = 0;</code>
   */
  ENCRYPTION_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Google managed encryption key.
   * </pre>
   *
   * <code>SERVICE_MANAGED = 1;</code>
   */
  SERVICE_MANAGED(1),
  /**
   * <pre>
   * Customer managed encryption key, which is stored in KMS.
   * </pre>
   *
   * <code>CLOUD_KMS = 2;</code>
   */
  CLOUD_KMS(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The source of encryption key is not specified.
   * </pre>
   *
   * <code>ENCRYPTION_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ENCRYPTION_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Google managed encryption key.
   * </pre>
   *
   * <code>SERVICE_MANAGED = 1;</code>
   */
  public static final int SERVICE_MANAGED_VALUE = 1;
  /**
   * <pre>
   * Customer managed encryption key, which is stored in KMS.
   * </pre>
   *
   * <code>CLOUD_KMS = 2;</code>
   */
  public static final int CLOUD_KMS_VALUE = 2;


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
  public static EncryptionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EncryptionType forNumber(int value) {
    switch (value) {
      case 0: return ENCRYPTION_TYPE_UNSPECIFIED;
      case 1: return SERVICE_MANAGED;
      case 2: return CLOUD_KMS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EncryptionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EncryptionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EncryptionType>() {
          public EncryptionType findValueByNumber(int number) {
            return EncryptionType.forNumber(number);
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
    return com.google.cloud.netapp.v1.CommonProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final EncryptionType[] VALUES = values();

  public static EncryptionType valueOf(
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

  private EncryptionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.netapp.v1.EncryptionType)
}

