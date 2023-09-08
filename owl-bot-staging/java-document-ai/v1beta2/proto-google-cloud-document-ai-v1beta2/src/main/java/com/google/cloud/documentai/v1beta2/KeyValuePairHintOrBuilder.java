// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta2/document_understanding.proto

package com.google.cloud.documentai.v1beta2;

public interface KeyValuePairHintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta2.KeyValuePairHint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The key text for the hint.
   * </pre>
   *
   * <code>string key = 1;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * The key text for the hint.
   * </pre>
   *
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * Type of the value. This is case-insensitive, and could be one of:
   * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
   * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
   * be ignored.
   * </pre>
   *
   * <code>repeated string value_types = 2;</code>
   * @return A list containing the valueTypes.
   */
  java.util.List<java.lang.String>
      getValueTypesList();
  /**
   * <pre>
   * Type of the value. This is case-insensitive, and could be one of:
   * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
   * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
   * be ignored.
   * </pre>
   *
   * <code>repeated string value_types = 2;</code>
   * @return The count of valueTypes.
   */
  int getValueTypesCount();
  /**
   * <pre>
   * Type of the value. This is case-insensitive, and could be one of:
   * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
   * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
   * be ignored.
   * </pre>
   *
   * <code>repeated string value_types = 2;</code>
   * @param index The index of the element to return.
   * @return The valueTypes at the given index.
   */
  java.lang.String getValueTypes(int index);
  /**
   * <pre>
   * Type of the value. This is case-insensitive, and could be one of:
   * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
   * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
   * be ignored.
   * </pre>
   *
   * <code>repeated string value_types = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the valueTypes at the given index.
   */
  com.google.protobuf.ByteString
      getValueTypesBytes(int index);
}
