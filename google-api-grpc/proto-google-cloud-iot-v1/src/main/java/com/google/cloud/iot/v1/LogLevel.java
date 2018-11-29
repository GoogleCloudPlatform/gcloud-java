// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

/**
 * <pre>
 * **Beta Feature**
 * The logging verbosity for device activity. Specifies which events should be
 * written to logs. For example, if the LogLevel is ERROR, only events that
 * terminate in errors will be logged. LogLevel is inclusive; enabling INFO
 * logging will also enable ERROR logging.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.iot.v1.LogLevel}
 */
public enum LogLevel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No logging specified. If not specified, logging will be disabled.
   * </pre>
   *
   * <code>LOG_LEVEL_UNSPECIFIED = 0;</code>
   */
  LOG_LEVEL_UNSPECIFIED(0),
  /**
   * <pre>
   * Disables logging.
   * </pre>
   *
   * <code>NONE = 10;</code>
   */
  NONE(10),
  /**
   * <pre>
   * Error events will be logged.
   * </pre>
   *
   * <code>ERROR = 20;</code>
   */
  ERROR(20),
  /**
   * <pre>
   * Informational events will be logged, such as connections and
   * disconnections.
   * </pre>
   *
   * <code>INFO = 30;</code>
   */
  INFO(30),
  /**
   * <pre>
   * All events will be logged.
   * </pre>
   *
   * <code>DEBUG = 40;</code>
   */
  DEBUG(40),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No logging specified. If not specified, logging will be disabled.
   * </pre>
   *
   * <code>LOG_LEVEL_UNSPECIFIED = 0;</code>
   */
  public static final int LOG_LEVEL_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Disables logging.
   * </pre>
   *
   * <code>NONE = 10;</code>
   */
  public static final int NONE_VALUE = 10;
  /**
   * <pre>
   * Error events will be logged.
   * </pre>
   *
   * <code>ERROR = 20;</code>
   */
  public static final int ERROR_VALUE = 20;
  /**
   * <pre>
   * Informational events will be logged, such as connections and
   * disconnections.
   * </pre>
   *
   * <code>INFO = 30;</code>
   */
  public static final int INFO_VALUE = 30;
  /**
   * <pre>
   * All events will be logged.
   * </pre>
   *
   * <code>DEBUG = 40;</code>
   */
  public static final int DEBUG_VALUE = 40;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static LogLevel valueOf(int value) {
    return forNumber(value);
  }

  public static LogLevel forNumber(int value) {
    switch (value) {
      case 0: return LOG_LEVEL_UNSPECIFIED;
      case 10: return NONE;
      case 20: return ERROR;
      case 30: return INFO;
      case 40: return DEBUG;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LogLevel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      LogLevel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LogLevel>() {
          public LogLevel findValueByNumber(int number) {
            return LogLevel.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.cloud.iot.v1.ResourcesProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final LogLevel[] VALUES = values();

  public static LogLevel valueOf(
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

  private LogLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.iot.v1.LogLevel)
}

