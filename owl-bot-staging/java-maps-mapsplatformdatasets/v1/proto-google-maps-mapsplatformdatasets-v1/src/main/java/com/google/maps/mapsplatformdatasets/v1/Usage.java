// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/mapsplatformdatasets/v1/dataset.proto

package com.google.maps.mapsplatformdatasets.v1;

/**
 * <pre>
 * Usage specifies where the data is intended to be used to inform how to
 * process the data.
 * </pre>
 *
 * Protobuf enum {@code google.maps.mapsplatformdatasets.v1.Usage}
 */
public enum Usage
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The usage of this dataset is not set.
   * </pre>
   *
   * <code>USAGE_UNSPECIFIED = 0;</code>
   */
  USAGE_UNSPECIFIED(0),
  /**
   * <pre>
   * This dataset will be used for data driven styling.
   * </pre>
   *
   * <code>USAGE_DATA_DRIVEN_STYLING = 1;</code>
   */
  USAGE_DATA_DRIVEN_STYLING(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The usage of this dataset is not set.
   * </pre>
   *
   * <code>USAGE_UNSPECIFIED = 0;</code>
   */
  public static final int USAGE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * This dataset will be used for data driven styling.
   * </pre>
   *
   * <code>USAGE_DATA_DRIVEN_STYLING = 1;</code>
   */
  public static final int USAGE_DATA_DRIVEN_STYLING_VALUE = 1;


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
  public static Usage valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Usage forNumber(int value) {
    switch (value) {
      case 0: return USAGE_UNSPECIFIED;
      case 1: return USAGE_DATA_DRIVEN_STYLING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Usage>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Usage> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Usage>() {
          public Usage findValueByNumber(int number) {
            return Usage.forNumber(number);
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
    return com.google.maps.mapsplatformdatasets.v1.DatasetProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Usage[] VALUES = values();

  public static Usage valueOf(
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

  private Usage(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.mapsplatformdatasets.v1.Usage)
}

