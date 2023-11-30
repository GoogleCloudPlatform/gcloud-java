// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/addressvalidation/v1/geocode.proto

package com.google.maps.addressvalidation.v1;

public interface PlusCodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.maps.addressvalidation.v1.PlusCode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Place's global (full) code, such as "9FWM33GV+HQ", representing an
   * 1/8000 by 1/8000 degree area (~14 by 14 meters).
   * </pre>
   *
   * <code>string global_code = 1;</code>
   * @return The globalCode.
   */
  java.lang.String getGlobalCode();
  /**
   * <pre>
   * Place's global (full) code, such as "9FWM33GV+HQ", representing an
   * 1/8000 by 1/8000 degree area (~14 by 14 meters).
   * </pre>
   *
   * <code>string global_code = 1;</code>
   * @return The bytes for globalCode.
   */
  com.google.protobuf.ByteString
      getGlobalCodeBytes();

  /**
   * <pre>
   * Place's compound code, such as "33GV+HQ, Ramberg, Norway", containing
   * the suffix of the global code and replacing the prefix with a formatted
   * name of a reference entity.
   * </pre>
   *
   * <code>string compound_code = 2;</code>
   * @return The compoundCode.
   */
  java.lang.String getCompoundCode();
  /**
   * <pre>
   * Place's compound code, such as "33GV+HQ, Ramberg, Norway", containing
   * the suffix of the global code and replacing the prefix with a formatted
   * name of a reference entity.
   * </pre>
   *
   * <code>string compound_code = 2;</code>
   * @return The bytes for compoundCode.
   */
  com.google.protobuf.ByteString
      getCompoundCodeBytes();
}
