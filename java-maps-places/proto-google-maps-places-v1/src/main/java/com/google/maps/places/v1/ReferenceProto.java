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
// source: google/maps/places/v1/reference.proto

// Protobuf Java Version: 3.25.3
package com.google.maps.places.v1;

public final class ReferenceProto {
  private ReferenceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_References_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_References_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/maps/places/v1/reference.proto\022"
          + "\025google.maps.places.v1\032\031google/api/resou"
          + "rce.proto\032\"google/maps/places/v1/review."
          + "proto\"n\n\nReferences\022.\n\007reviews\030\001 \003(\0132\035.g"
          + "oogle.maps.places.v1.Review\0220\n\006places\030\002 "
          + "\003(\tB \372A\035\n\033places.googleapis.com/PlaceB\242\001"
          + "\n\031com.google.maps.places.v1B\016ReferencePr"
          + "otoP\001Z7cloud.google.com/go/maps/places/a"
          + "piv1/placespb;placespb\370\001\001\242\002\006GMPSV1\252\002\025Goo"
          + "gle.Maps.Places.V1\312\002\025Google\\Maps\\Places\\"
          + "V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.maps.places.v1.ReviewProto.getDescriptor(),
            });
    internal_static_google_maps_places_v1_References_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_places_v1_References_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_References_descriptor,
            new java.lang.String[] {
              "Reviews", "Places",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.maps.places.v1.ReviewProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
