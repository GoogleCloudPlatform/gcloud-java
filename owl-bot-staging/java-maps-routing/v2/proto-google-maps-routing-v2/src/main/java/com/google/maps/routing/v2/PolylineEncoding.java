// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routing/v2/polyline.proto

package com.google.maps.routing.v2;

/**
 * <pre>
 * Specifies the preferred type of polyline to be returned.
 * </pre>
 *
 * Protobuf enum {@code google.maps.routing.v2.PolylineEncoding}
 */
public enum PolylineEncoding
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No polyline type preference specified. Defaults to `ENCODED_POLYLINE`.
   * </pre>
   *
   * <code>POLYLINE_ENCODING_UNSPECIFIED = 0;</code>
   */
  POLYLINE_ENCODING_UNSPECIFIED(0),
  /**
   * <pre>
   * Specifies a polyline encoded using the [polyline encoding
   * algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm).
   * </pre>
   *
   * <code>ENCODED_POLYLINE = 1;</code>
   */
  ENCODED_POLYLINE(1),
  /**
   * <pre>
   * Specifies a polyline using the [GeoJSON LineString
   * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
   * </pre>
   *
   * <code>GEO_JSON_LINESTRING = 2;</code>
   */
  GEO_JSON_LINESTRING(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No polyline type preference specified. Defaults to `ENCODED_POLYLINE`.
   * </pre>
   *
   * <code>POLYLINE_ENCODING_UNSPECIFIED = 0;</code>
   */
  public static final int POLYLINE_ENCODING_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Specifies a polyline encoded using the [polyline encoding
   * algorithm](https://developers.google.com/maps/documentation/utilities/polylinealgorithm).
   * </pre>
   *
   * <code>ENCODED_POLYLINE = 1;</code>
   */
  public static final int ENCODED_POLYLINE_VALUE = 1;
  /**
   * <pre>
   * Specifies a polyline using the [GeoJSON LineString
   * format](https://tools.ietf.org/html/rfc7946#section-3.1.4)
   * </pre>
   *
   * <code>GEO_JSON_LINESTRING = 2;</code>
   */
  public static final int GEO_JSON_LINESTRING_VALUE = 2;


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
  public static PolylineEncoding valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PolylineEncoding forNumber(int value) {
    switch (value) {
      case 0: return POLYLINE_ENCODING_UNSPECIFIED;
      case 1: return ENCODED_POLYLINE;
      case 2: return GEO_JSON_LINESTRING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PolylineEncoding>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PolylineEncoding> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PolylineEncoding>() {
          public PolylineEncoding findValueByNumber(int number) {
            return PolylineEncoding.forNumber(number);
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
    return com.google.maps.routing.v2.PolylineProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final PolylineEncoding[] VALUES = values();

  public static PolylineEncoding valueOf(
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

  private PolylineEncoding(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.routing.v2.PolylineEncoding)
}

