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
// source: google/shopping/merchant/datasources/v1beta/fileinputs.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.datasources.v1beta;

public final class FileInputsProto {
  private FileInputsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_datasources_v1beta_FileInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_datasources_v1beta_FileInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_datasources_v1beta_FileInput_FetchSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_datasources_v1beta_FileInput_FetchSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/shopping/merchant/datasources/v"
          + "1beta/fileinputs.proto\022+google.shopping."
          + "merchant.datasources.v1beta\032\037google/api/"
          + "field_behavior.proto\032\033google/type/dayofw"
          + "eek.proto\032\033google/type/timeofday.proto\"\235"
          + "\006\n\tFileInput\022a\n\016fetch_settings\030\001 \001(\0132D.g"
          + "oogle.shopping.merchant.datasources.v1be"
          + "ta.FileInput.FetchSettingsB\003\340A\001\022\026\n\tfile_"
          + "name\030\002 \001(\tB\003\340A\001\022b\n\017file_input_type\030\003 \001(\016"
          + "2D.google.shopping.merchant.datasources."
          + "v1beta.FileInput.FileInputTypeB\003\340A\003\032\324\003\n\r"
          + "FetchSettings\022\024\n\007enabled\030\001 \001(\010B\003\340A\001\022\031\n\014d"
          + "ay_of_month\030\002 \001(\005B\003\340A\001\0220\n\013time_of_day\030\003 "
          + "\001(\0132\026.google.type.TimeOfDayB\003\340A\001\0220\n\013day_"
          + "of_week\030\004 \001(\0162\026.google.type.DayOfWeekB\003\340"
          + "A\001\022\026\n\ttime_zone\030\005 \001(\tB\003\340A\001\022f\n\tfrequency\030"
          + "\006 \001(\0162N.google.shopping.merchant.datasou"
          + "rces.v1beta.FileInput.FetchSettings.Freq"
          + "uencyB\003\340A\002\022\026\n\tfetch_uri\030\007 \001(\tB\003\340A\001\022\025\n\010us"
          + "ername\030\010 \001(\tB\003\340A\001\022\025\n\010password\030\t \001(\tB\003\340A\001"
          + "\"h\n\tFrequency\022\031\n\025FREQUENCY_UNSPECIFIED\020\000"
          + "\022\023\n\017FREQUENCY_DAILY\020\001\022\024\n\020FREQUENCY_WEEKL"
          + "Y\020\002\022\025\n\021FREQUENCY_MONTHLY\020\003\"Z\n\rFileInputT"
          + "ype\022\037\n\033FILE_INPUT_TYPE_UNSPECIFIED\020\000\022\n\n\006"
          + "UPLOAD\020\001\022\t\n\005FETCH\020\002\022\021\n\rGOOGLE_SHEETS\020\003B\253"
          + "\002\n/com.google.shopping.merchant.datasour"
          + "ces.v1betaB\017FileInputsProtoP\001ZWcloud.goo"
          + "gle.com/go/shopping/merchant/datasources"
          + "/apiv1beta/datasourcespb;datasourcespb\252\002"
          + "+Google.Shopping.Merchant.DataSources.V1"
          + "Beta\312\002+Google\\Shopping\\Merchant\\DataSour"
          + "ces\\V1beta\352\002/Google::Shopping::Merchant:"
          + ":DataSources::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.type.DayOfWeekProto.getDescriptor(),
              com.google.type.TimeOfDayProto.getDescriptor(),
            });
    internal_static_google_shopping_merchant_datasources_v1beta_FileInput_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_shopping_merchant_datasources_v1beta_FileInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_datasources_v1beta_FileInput_descriptor,
            new java.lang.String[] {
              "FetchSettings", "FileName", "FileInputType",
            });
    internal_static_google_shopping_merchant_datasources_v1beta_FileInput_FetchSettings_descriptor =
        internal_static_google_shopping_merchant_datasources_v1beta_FileInput_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_shopping_merchant_datasources_v1beta_FileInput_FetchSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_datasources_v1beta_FileInput_FetchSettings_descriptor,
            new java.lang.String[] {
              "Enabled",
              "DayOfMonth",
              "TimeOfDay",
              "DayOfWeek",
              "TimeZone",
              "Frequency",
              "FetchUri",
              "Username",
              "Password",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.type.DayOfWeekProto.getDescriptor();
    com.google.type.TimeOfDayProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
