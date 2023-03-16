// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

package com.google.cloud.datastream.v1alpha1;

/**
 * <pre>
 * File format in Cloud Storage.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.datastream.v1alpha1.GcsFileFormat}
 */
@java.lang.Deprecated public enum GcsFileFormat
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified Cloud Storage file format.
   * </pre>
   *
   * <code>GCS_FILE_FORMAT_UNSPECIFIED = 0;</code>
   */
  GCS_FILE_FORMAT_UNSPECIFIED(0),
  /**
   * <pre>
   * Avro file format
   * </pre>
   *
   * <code>AVRO = 1;</code>
   */
  AVRO(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified Cloud Storage file format.
   * </pre>
   *
   * <code>GCS_FILE_FORMAT_UNSPECIFIED = 0;</code>
   */
  public static final int GCS_FILE_FORMAT_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Avro file format
   * </pre>
   *
   * <code>AVRO = 1;</code>
   */
  public static final int AVRO_VALUE = 1;


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
  public static GcsFileFormat valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GcsFileFormat forNumber(int value) {
    switch (value) {
      case 0: return GCS_FILE_FORMAT_UNSPECIFIED;
      case 1: return AVRO;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GcsFileFormat>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GcsFileFormat> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GcsFileFormat>() {
          public GcsFileFormat findValueByNumber(int number) {
            return GcsFileFormat.forNumber(number);
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
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final GcsFileFormat[] VALUES = values();

  public static GcsFileFormat valueOf(
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

  private GcsFileFormat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.datastream.v1alpha1.GcsFileFormat)
}

