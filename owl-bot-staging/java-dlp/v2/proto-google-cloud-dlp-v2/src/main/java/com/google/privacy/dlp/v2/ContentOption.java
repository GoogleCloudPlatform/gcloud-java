// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Deprecated and unused.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.ContentOption}
 */
public enum ContentOption
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Includes entire content of a file or a data stream.
   * </pre>
   *
   * <code>CONTENT_UNSPECIFIED = 0;</code>
   */
  CONTENT_UNSPECIFIED(0),
  /**
   * <pre>
   * Text content within the data, excluding any metadata.
   * </pre>
   *
   * <code>CONTENT_TEXT = 1;</code>
   */
  CONTENT_TEXT(1),
  /**
   * <pre>
   * Images found in the data.
   * </pre>
   *
   * <code>CONTENT_IMAGE = 2;</code>
   */
  CONTENT_IMAGE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Includes entire content of a file or a data stream.
   * </pre>
   *
   * <code>CONTENT_UNSPECIFIED = 0;</code>
   */
  public static final int CONTENT_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Text content within the data, excluding any metadata.
   * </pre>
   *
   * <code>CONTENT_TEXT = 1;</code>
   */
  public static final int CONTENT_TEXT_VALUE = 1;
  /**
   * <pre>
   * Images found in the data.
   * </pre>
   *
   * <code>CONTENT_IMAGE = 2;</code>
   */
  public static final int CONTENT_IMAGE_VALUE = 2;


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
  public static ContentOption valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ContentOption forNumber(int value) {
    switch (value) {
      case 0: return CONTENT_UNSPECIFIED;
      case 1: return CONTENT_TEXT;
      case 2: return CONTENT_IMAGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ContentOption>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ContentOption> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ContentOption>() {
          public ContentOption findValueByNumber(int number) {
            return ContentOption.forNumber(number);
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
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(5);
  }

  private static final ContentOption[] VALUES = values();

  public static ContentOption valueOf(
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

  private ContentOption(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.ContentOption)
}

