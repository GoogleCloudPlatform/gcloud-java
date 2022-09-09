// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/memcache/v1/cloud_memcache.proto

package com.google.cloud.memcache.v1;

/**
 * <pre>
 * Memcached versions supported by our service.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.memcache.v1.MemcacheVersion}
 */
public enum MemcacheVersion
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MEMCACHE_VERSION_UNSPECIFIED = 0;</code>
   */
  MEMCACHE_VERSION_UNSPECIFIED(0),
  /**
   * <pre>
   * Memcached 1.5 version.
   * </pre>
   *
   * <code>MEMCACHE_1_5 = 1;</code>
   */
  MEMCACHE_1_5(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MEMCACHE_VERSION_UNSPECIFIED = 0;</code>
   */
  public static final int MEMCACHE_VERSION_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Memcached 1.5 version.
   * </pre>
   *
   * <code>MEMCACHE_1_5 = 1;</code>
   */
  public static final int MEMCACHE_1_5_VALUE = 1;


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
  public static MemcacheVersion valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MemcacheVersion forNumber(int value) {
    switch (value) {
      case 0: return MEMCACHE_VERSION_UNSPECIFIED;
      case 1: return MEMCACHE_1_5;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MemcacheVersion>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MemcacheVersion> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MemcacheVersion>() {
          public MemcacheVersion findValueByNumber(int number) {
            return MemcacheVersion.forNumber(number);
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
    return com.google.cloud.memcache.v1.CloudMemcacheProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final MemcacheVersion[] VALUES = values();

  public static MemcacheVersion valueOf(
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

  private MemcacheVersion(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.memcache.v1.MemcacheVersion)
}

