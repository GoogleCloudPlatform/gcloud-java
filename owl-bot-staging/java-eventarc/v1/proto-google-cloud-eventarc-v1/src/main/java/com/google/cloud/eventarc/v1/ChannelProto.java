// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/v1/channel.proto

package com.google.cloud.eventarc.v1;

public final class ChannelProto {
  private ChannelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_eventarc_v1_Channel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_Channel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/eventarc/v1/channel.proto" +
      "\022\030google.cloud.eventarc.v1\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\032\037google/protobuf/timestamp.proto\"" +
      "\272\004\n\007Channel\022\022\n\004name\030\001 \001(\tB\004\342A\001\002\022\021\n\003uid\030\002" +
      " \001(\tB\004\342A\001\003\0225\n\013create_time\030\005 \001(\0132\032.google" +
      ".protobuf.TimestampB\004\342A\001\003\0225\n\013update_time" +
      "\030\006 \001(\0132\032.google.protobuf.TimestampB\004\342A\001\003" +
      "\022\020\n\010provider\030\007 \001(\t\022\034\n\014pubsub_topic\030\010 \001(\t" +
      "B\004\342A\001\003H\000\022<\n\005state\030\t \001(\0162\'.google.cloud.e" +
      "ventarc.v1.Channel.StateB\004\342A\001\003\022\036\n\020activa" +
      "tion_token\030\n \001(\tB\004\342A\001\003\022C\n\017crypto_key_nam" +
      "e\030\013 \001(\tB*\342A\001\001\372A#\n!cloudkms.googleapis.co" +
      "m/CryptoKey\"E\n\005State\022\025\n\021STATE_UNSPECIFIE" +
      "D\020\000\022\013\n\007PENDING\020\001\022\n\n\006ACTIVE\020\002\022\014\n\010INACTIVE" +
      "\020\003:s\352Ap\n\037eventarc.googleapis.com/Channel" +
      "\022:projects/{project}/locations/{location" +
      "}/channels/{channel}*\010channels2\007channelB" +
      "\013\n\ttransportB\274\001\n\034com.google.cloud.eventa" +
      "rc.v1B\014ChannelProtoP\001Z8cloud.google.com/" +
      "go/eventarc/apiv1/eventarcpb;eventarcpb\252" +
      "\002\030Google.Cloud.Eventarc.V1\312\002\030Google\\Clou" +
      "d\\Eventarc\\V1\352\002\033Google::Cloud::Eventarc:" +
      ":V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_eventarc_v1_Channel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_eventarc_v1_Channel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_eventarc_v1_Channel_descriptor,
        new java.lang.String[] { "Name", "Uid", "CreateTime", "UpdateTime", "Provider", "PubsubTopic", "State", "ActivationToken", "CryptoKeyName", "Transport", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
