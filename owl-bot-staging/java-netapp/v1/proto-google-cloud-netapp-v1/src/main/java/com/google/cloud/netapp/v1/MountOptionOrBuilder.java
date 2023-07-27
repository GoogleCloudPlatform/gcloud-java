// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/netapp/v1/volume.proto

package com.google.cloud.netapp.v1;

public interface MountOptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.MountOption)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Export string
   * </pre>
   *
   * <code>string export = 1;</code>
   * @return The export.
   */
  java.lang.String getExport();
  /**
   * <pre>
   * Export string
   * </pre>
   *
   * <code>string export = 1;</code>
   * @return The bytes for export.
   */
  com.google.protobuf.ByteString
      getExportBytes();

  /**
   * <pre>
   * Full export string
   * </pre>
   *
   * <code>string export_full = 2;</code>
   * @return The exportFull.
   */
  java.lang.String getExportFull();
  /**
   * <pre>
   * Full export string
   * </pre>
   *
   * <code>string export_full = 2;</code>
   * @return The bytes for exportFull.
   */
  com.google.protobuf.ByteString
      getExportFullBytes();

  /**
   * <pre>
   * Protocol to mount with.
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Protocols protocol = 3;</code>
   * @return The enum numeric value on the wire for protocol.
   */
  int getProtocolValue();
  /**
   * <pre>
   * Protocol to mount with.
   * </pre>
   *
   * <code>.google.cloud.netapp.v1.Protocols protocol = 3;</code>
   * @return The protocol.
   */
  com.google.cloud.netapp.v1.Protocols getProtocol();

  /**
   * <pre>
   * Instructions for mounting
   * </pre>
   *
   * <code>string instructions = 4;</code>
   * @return The instructions.
   */
  java.lang.String getInstructions();
  /**
   * <pre>
   * Instructions for mounting
   * </pre>
   *
   * <code>string instructions = 4;</code>
   * @return The bytes for instructions.
   */
  com.google.protobuf.ByteString
      getInstructionsBytes();
}
