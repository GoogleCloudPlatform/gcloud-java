// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/accelerator_type.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Represents a hardware accelerator type.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.aiplatform.v1beta1.AcceleratorType}
 */
public enum AcceleratorType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified accelerator type, which means no accelerator.
   * </pre>
   *
   * <code>ACCELERATOR_TYPE_UNSPECIFIED = 0;</code>
   */
  ACCELERATOR_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * Nvidia Tesla K80 GPU.
   * </pre>
   *
   * <code>NVIDIA_TESLA_K80 = 1;</code>
   */
  NVIDIA_TESLA_K80(1),
  /**
   * <pre>
   * Nvidia Tesla P100 GPU.
   * </pre>
   *
   * <code>NVIDIA_TESLA_P100 = 2;</code>
   */
  NVIDIA_TESLA_P100(2),
  /**
   * <pre>
   * Nvidia Tesla V100 GPU.
   * </pre>
   *
   * <code>NVIDIA_TESLA_V100 = 3;</code>
   */
  NVIDIA_TESLA_V100(3),
  /**
   * <pre>
   * Nvidia Tesla P4 GPU.
   * </pre>
   *
   * <code>NVIDIA_TESLA_P4 = 4;</code>
   */
  NVIDIA_TESLA_P4(4),
  /**
   * <pre>
   * Nvidia Tesla T4 GPU.
   * </pre>
   *
   * <code>NVIDIA_TESLA_T4 = 5;</code>
   */
  NVIDIA_TESLA_T4(5),
  /**
   * <pre>
   * Nvidia Tesla A100 GPU.
   * </pre>
   *
   * <code>NVIDIA_TESLA_A100 = 8;</code>
   */
  NVIDIA_TESLA_A100(8),
  /**
   * <pre>
   * Nvidia A100 80GB GPU.
   * </pre>
   *
   * <code>NVIDIA_A100_80GB = 9;</code>
   */
  NVIDIA_A100_80GB(9),
  /**
   * <pre>
   * Nvidia L4 GPU.
   * </pre>
   *
   * <code>NVIDIA_L4 = 11;</code>
   */
  NVIDIA_L4(11),
  /**
   * <pre>
   * Nvidia H100 80Gb GPU.
   * </pre>
   *
   * <code>NVIDIA_H100_80GB = 13;</code>
   */
  NVIDIA_H100_80GB(13),
  /**
   * <pre>
   * TPU v2.
   * </pre>
   *
   * <code>TPU_V2 = 6;</code>
   */
  TPU_V2(6),
  /**
   * <pre>
   * TPU v3.
   * </pre>
   *
   * <code>TPU_V3 = 7;</code>
   */
  TPU_V3(7),
  /**
   * <pre>
   * TPU v4.
   * </pre>
   *
   * <code>TPU_V4_POD = 10;</code>
   */
  TPU_V4_POD(10),
  /**
   * <pre>
   * TPU v5.
   * </pre>
   *
   * <code>TPU_V5_LITEPOD = 12;</code>
   */
  TPU_V5_LITEPOD(12),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified accelerator type, which means no accelerator.
   * </pre>
   *
   * <code>ACCELERATOR_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ACCELERATOR_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Nvidia Tesla K80 GPU.
   * </pre>
   *
   * <code>NVIDIA_TESLA_K80 = 1;</code>
   */
  public static final int NVIDIA_TESLA_K80_VALUE = 1;
  /**
   * <pre>
   * Nvidia Tesla P100 GPU.
   * </pre>
   *
   * <code>NVIDIA_TESLA_P100 = 2;</code>
   */
  public static final int NVIDIA_TESLA_P100_VALUE = 2;
  /**
   * <pre>
   * Nvidia Tesla V100 GPU.
   * </pre>
   *
   * <code>NVIDIA_TESLA_V100 = 3;</code>
   */
  public static final int NVIDIA_TESLA_V100_VALUE = 3;
  /**
   * <pre>
   * Nvidia Tesla P4 GPU.
   * </pre>
   *
   * <code>NVIDIA_TESLA_P4 = 4;</code>
   */
  public static final int NVIDIA_TESLA_P4_VALUE = 4;
  /**
   * <pre>
   * Nvidia Tesla T4 GPU.
   * </pre>
   *
   * <code>NVIDIA_TESLA_T4 = 5;</code>
   */
  public static final int NVIDIA_TESLA_T4_VALUE = 5;
  /**
   * <pre>
   * Nvidia Tesla A100 GPU.
   * </pre>
   *
   * <code>NVIDIA_TESLA_A100 = 8;</code>
   */
  public static final int NVIDIA_TESLA_A100_VALUE = 8;
  /**
   * <pre>
   * Nvidia A100 80GB GPU.
   * </pre>
   *
   * <code>NVIDIA_A100_80GB = 9;</code>
   */
  public static final int NVIDIA_A100_80GB_VALUE = 9;
  /**
   * <pre>
   * Nvidia L4 GPU.
   * </pre>
   *
   * <code>NVIDIA_L4 = 11;</code>
   */
  public static final int NVIDIA_L4_VALUE = 11;
  /**
   * <pre>
   * Nvidia H100 80Gb GPU.
   * </pre>
   *
   * <code>NVIDIA_H100_80GB = 13;</code>
   */
  public static final int NVIDIA_H100_80GB_VALUE = 13;
  /**
   * <pre>
   * TPU v2.
   * </pre>
   *
   * <code>TPU_V2 = 6;</code>
   */
  public static final int TPU_V2_VALUE = 6;
  /**
   * <pre>
   * TPU v3.
   * </pre>
   *
   * <code>TPU_V3 = 7;</code>
   */
  public static final int TPU_V3_VALUE = 7;
  /**
   * <pre>
   * TPU v4.
   * </pre>
   *
   * <code>TPU_V4_POD = 10;</code>
   */
  public static final int TPU_V4_POD_VALUE = 10;
  /**
   * <pre>
   * TPU v5.
   * </pre>
   *
   * <code>TPU_V5_LITEPOD = 12;</code>
   */
  public static final int TPU_V5_LITEPOD_VALUE = 12;


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
  public static AcceleratorType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AcceleratorType forNumber(int value) {
    switch (value) {
      case 0: return ACCELERATOR_TYPE_UNSPECIFIED;
      case 1: return NVIDIA_TESLA_K80;
      case 2: return NVIDIA_TESLA_P100;
      case 3: return NVIDIA_TESLA_V100;
      case 4: return NVIDIA_TESLA_P4;
      case 5: return NVIDIA_TESLA_T4;
      case 8: return NVIDIA_TESLA_A100;
      case 9: return NVIDIA_A100_80GB;
      case 11: return NVIDIA_L4;
      case 13: return NVIDIA_H100_80GB;
      case 6: return TPU_V2;
      case 7: return TPU_V3;
      case 10: return TPU_V4_POD;
      case 12: return TPU_V5_LITEPOD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AcceleratorType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AcceleratorType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AcceleratorType>() {
          public AcceleratorType findValueByNumber(int number) {
            return AcceleratorType.forNumber(number);
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
    return com.google.cloud.aiplatform.v1beta1.AcceleratorTypeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AcceleratorType[] VALUES = values();

  public static AcceleratorType valueOf(
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

  private AcceleratorType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.AcceleratorType)
}

