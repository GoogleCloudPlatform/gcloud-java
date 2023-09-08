// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta3/barcode.proto

package com.google.cloud.documentai.v1beta3;

public interface BarcodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.Barcode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Format of a barcode.
   * The supported formats are:
   *
   * - `CODE_128`: Code 128 type.
   * - `CODE_39`: Code 39 type.
   * - `CODE_93`: Code 93 type.
   * - `CODABAR`: Codabar type.
   * - `DATA_MATRIX`: 2D Data Matrix type.
   * - `ITF`: ITF type.
   * - `EAN_13`: EAN-13 type.
   * - `EAN_8`: EAN-8 type.
   * - `QR_CODE`: 2D QR code type.
   * - `UPC_A`: UPC-A type.
   * - `UPC_E`: UPC-E type.
   * - `PDF417`: PDF417 type.
   * - `AZTEC`: 2D Aztec code type.
   * - `DATABAR`: GS1 DataBar code type.
   * </pre>
   *
   * <code>string format = 1;</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <pre>
   * Format of a barcode.
   * The supported formats are:
   *
   * - `CODE_128`: Code 128 type.
   * - `CODE_39`: Code 39 type.
   * - `CODE_93`: Code 93 type.
   * - `CODABAR`: Codabar type.
   * - `DATA_MATRIX`: 2D Data Matrix type.
   * - `ITF`: ITF type.
   * - `EAN_13`: EAN-13 type.
   * - `EAN_8`: EAN-8 type.
   * - `QR_CODE`: 2D QR code type.
   * - `UPC_A`: UPC-A type.
   * - `UPC_E`: UPC-E type.
   * - `PDF417`: PDF417 type.
   * - `AZTEC`: 2D Aztec code type.
   * - `DATABAR`: GS1 DataBar code type.
   * </pre>
   *
   * <code>string format = 1;</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <pre>
   * Value format describes the format of the value that a barcode
   * encodes.
   * The supported formats are:
   *
   * - `CONTACT_INFO`: Contact information.
   * - `EMAIL`: Email address.
   * - `ISBN`: ISBN identifier.
   * - `PHONE`: Phone number.
   * - `PRODUCT`: Product.
   * - `SMS`: SMS message.
   * - `TEXT`: Text string.
   * - `URL`: URL address.
   * - `WIFI`: Wifi information.
   * - `GEO`: Geo-localization.
   * - `CALENDAR_EVENT`: Calendar event.
   * - `DRIVER_LICENSE`: Driver's license.
   * </pre>
   *
   * <code>string value_format = 2;</code>
   * @return The valueFormat.
   */
  java.lang.String getValueFormat();
  /**
   * <pre>
   * Value format describes the format of the value that a barcode
   * encodes.
   * The supported formats are:
   *
   * - `CONTACT_INFO`: Contact information.
   * - `EMAIL`: Email address.
   * - `ISBN`: ISBN identifier.
   * - `PHONE`: Phone number.
   * - `PRODUCT`: Product.
   * - `SMS`: SMS message.
   * - `TEXT`: Text string.
   * - `URL`: URL address.
   * - `WIFI`: Wifi information.
   * - `GEO`: Geo-localization.
   * - `CALENDAR_EVENT`: Calendar event.
   * - `DRIVER_LICENSE`: Driver's license.
   * </pre>
   *
   * <code>string value_format = 2;</code>
   * @return The bytes for valueFormat.
   */
  com.google.protobuf.ByteString
      getValueFormatBytes();

  /**
   * <pre>
   * Raw value encoded in the barcode.
   * For example: `'MEBKM:TITLE:Google;URL:https://www.google.com;;'`.
   * </pre>
   *
   * <code>string raw_value = 3;</code>
   * @return The rawValue.
   */
  java.lang.String getRawValue();
  /**
   * <pre>
   * Raw value encoded in the barcode.
   * For example: `'MEBKM:TITLE:Google;URL:https://www.google.com;;'`.
   * </pre>
   *
   * <code>string raw_value = 3;</code>
   * @return The bytes for rawValue.
   */
  com.google.protobuf.ByteString
      getRawValueBytes();
}
