/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/publishing/v1/publisher.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.eventarc.publishing.v1;

public final class PublisherProto {
  private PublisherProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_publishing_v1_PublishEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_publishing_v1_PublishEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_publishing_v1_PublishEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_publishing_v1_PublishEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_publishing_v1_PublishRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_publishing_v1_PublishRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_publishing_v1_PublishResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_publishing_v1_PublishResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/eventarc/publishing/v1/pu"
          + "blisher.proto\022#google.cloud.eventarc.pub"
          + "lishing.v1\032\034google/api/annotations.proto"
          + "\032\027google/api/client.proto\032\037google/api/fi"
          + "eld_behavior.proto\032\033google/api/field_inf"
          + "o.proto\0325google/cloud/eventarc/publishin"
          + "g/v1/cloud_event.proto\032\031google/protobuf/"
          + "any.proto\"~\n%PublishChannelConnectionEve"
          + "ntsRequest\022\032\n\022channel_connection\030\001 \001(\t\022$"
          + "\n\006events\030\002 \003(\0132\024.google.protobuf.Any\022\023\n\013"
          + "text_events\030\003 \003(\t\"(\n&PublishChannelConne"
          + "ctionEventsResponse\"b\n\024PublishEventsRequ"
          + "est\022\017\n\007channel\030\001 \001(\t\022$\n\006events\030\002 \003(\0132\024.g"
          + "oogle.protobuf.Any\022\023\n\013text_events\030\003 \003(\t\""
          + "\027\n\025PublishEventsResponse\"\256\001\n\016PublishRequ"
          + "est\022\030\n\013message_bus\030\001 \001(\tB\003\340A\002\022H\n\rproto_m"
          + "essage\030\002 \001(\0132/.google.cloud.eventarc.pub"
          + "lishing.v1.CloudEventH\000\022\026\n\014json_message\030"
          + "\003 \001(\tH\000\022\026\n\014avro_message\030\004 \001(\014H\000B\010\n\006forma"
          + "t\"\021\n\017PublishResponse2\223\006\n\tPublisher\022\230\002\n\036P"
          + "ublishChannelConnectionEvents\022J.google.c"
          + "loud.eventarc.publishing.v1.PublishChann"
          + "elConnectionEventsRequest\032K.google.cloud"
          + ".eventarc.publishing.v1.PublishChannelCo"
          + "nnectionEventsResponse\"]\202\323\344\223\002W\"R/v1/{cha"
          + "nnel_connection=projects/*/locations/*/c"
          + "hannelConnections/*}:publishEvents:\001*\022\320\001"
          + "\n\rPublishEvents\0229.google.cloud.eventarc."
          + "publishing.v1.PublishEventsRequest\032:.goo"
          + "gle.cloud.eventarc.publishing.v1.Publish"
          + "EventsResponse\"H\202\323\344\223\002B\"=/v1/{channel=pro"
          + "jects/*/locations/*/channels/*}:publishE"
          + "vents:\001*\022\300\001\n\007Publish\0223.google.cloud.even"
          + "tarc.publishing.v1.PublishRequest\0324.goog"
          + "le.cloud.eventarc.publishing.v1.PublishR"
          + "esponse\"J\202\323\344\223\002D\"?/v1/{message_bus=projec"
          + "ts/*/locations/*/messageBuses/*}:publish"
          + ":\001*\032U\312A!eventarcpublishing.googleapis.co"
          + "m\322A.https://www.googleapis.com/auth/clou"
          + "d-platformB\372\001\n\'com.google.cloud.eventarc"
          + ".publishing.v1B\016PublisherProtoP\001ZGcloud."
          + "google.com/go/eventarc/publishing/apiv1/"
          + "publishingpb;publishingpb\252\002#Google.Cloud"
          + ".Eventarc.Publishing.V1\312\002#Google\\Cloud\\E"
          + "ventarc\\Publishing\\V1\352\002\'Google::Cloud::E"
          + "ventarc::Publishing::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.FieldInfoProto.getDescriptor(),
              com.google.cloud.eventarc.publishing.v1.CloudEventProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
            });
    internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsRequest_descriptor,
            new java.lang.String[] {
              "ChannelConnection", "Events", "TextEvents",
            });
    internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_publishing_v1_PublishChannelConnectionEventsResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_eventarc_publishing_v1_PublishEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_eventarc_publishing_v1_PublishEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_publishing_v1_PublishEventsRequest_descriptor,
            new java.lang.String[] {
              "Channel", "Events", "TextEvents",
            });
    internal_static_google_cloud_eventarc_publishing_v1_PublishEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_eventarc_publishing_v1_PublishEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_publishing_v1_PublishEventsResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_eventarc_publishing_v1_PublishRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_eventarc_publishing_v1_PublishRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_publishing_v1_PublishRequest_descriptor,
            new java.lang.String[] {
              "MessageBus", "ProtoMessage", "JsonMessage", "AvroMessage", "Format",
            });
    internal_static_google_cloud_eventarc_publishing_v1_PublishResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_eventarc_publishing_v1_PublishResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_publishing_v1_PublishResponse_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.FieldInfoProto.getDescriptor();
    com.google.cloud.eventarc.publishing.v1.CloudEventProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
