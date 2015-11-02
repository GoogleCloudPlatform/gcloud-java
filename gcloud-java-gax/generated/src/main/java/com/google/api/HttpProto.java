// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/http.proto

package com.google.api;

public final class HttpProto {
  private HttpProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Http_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_Http_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_HttpRule_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_HttpRule_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_CustomHttpPattern_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_CustomHttpPattern_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MediaUpload_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_MediaUpload_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MediaDownload_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_api_MediaDownload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025google/api/http.proto\022\ngoogle.api\"+\n\004H" +
      "ttp\022#\n\005rules\030\001 \003(\0132\024.google.api.HttpRule" +
      "\"\314\002\n\010HttpRule\022\020\n\010selector\030\001 \001(\t\022\r\n\003get\030\002" +
      " \001(\tH\000\022\r\n\003put\030\003 \001(\tH\000\022\016\n\004post\030\004 \001(\tH\000\022\020\n" +
      "\006delete\030\005 \001(\tH\000\022\017\n\005patch\030\006 \001(\tH\000\022/\n\006cust" +
      "om\030\010 \001(\0132\035.google.api.CustomHttpPatternH" +
      "\000\022\014\n\004body\030\007 \001(\t\022-\n\014media_upload\030\t \001(\0132\027." +
      "google.api.MediaUpload\0221\n\016media_download" +
      "\030\n \001(\0132\031.google.api.MediaDownload\0221\n\023add" +
      "itional_bindings\030\013 \003(\0132\024.google.api.Http",
      "RuleB\t\n\007pattern\"/\n\021CustomHttpPattern\022\014\n\004" +
      "kind\030\001 \001(\t\022\014\n\004path\030\002 \001(\t\"\036\n\013MediaUpload\022" +
      "\017\n\007enabled\030\003 \001(\010\" \n\rMediaDownload\022\017\n\007ena" +
      "bled\030\001 \001(\010B \n\016com.google.apiB\tHttpProtoP" +
      "\001\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_api_Http_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Http_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_Http_descriptor,
        new java.lang.String[] { "Rules", });
    internal_static_google_api_HttpRule_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_HttpRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_HttpRule_descriptor,
        new java.lang.String[] { "Selector", "Get", "Put", "Post", "Delete", "Patch", "Custom", "Body", "MediaUpload", "MediaDownload", "AdditionalBindings", "Pattern", });
    internal_static_google_api_CustomHttpPattern_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_CustomHttpPattern_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_CustomHttpPattern_descriptor,
        new java.lang.String[] { "Kind", "Path", });
    internal_static_google_api_MediaUpload_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_api_MediaUpload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_MediaUpload_descriptor,
        new java.lang.String[] { "Enabled", });
    internal_static_google_api_MediaDownload_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_api_MediaDownload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_api_MediaDownload_descriptor,
        new java.lang.String[] { "Enabled", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
